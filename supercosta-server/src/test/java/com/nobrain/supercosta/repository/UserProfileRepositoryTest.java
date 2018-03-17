package com.nobrain.supercosta.repository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.nobrain.supercosta.biz.repository.UserProfileRepository;
import com.nobrain.supercosta.core.config.RepositoryConfiguration;
import com.nobrain.supercosta.dto.user.UserProfile;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@Import({RepositoryConfiguration.class})
@Slf4j
public class UserProfileRepositoryTest {

	@Autowired
	private UserProfileRepository profileRepository;

	private static final SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/yyyy");

	@Test
	public void testSaveWithoutAuth() {
		log.debug("abcdefg");
		UserProfile profile = new UserProfile();
		profile.setUserId(100l);
		profile.setFirstName("testfirst");
		profile.setLastName("testlast");
		UserProfile getProfile = profileRepository.save(profile);
		assertThat(getProfile.getId(), equalTo(1L));
		assertThat(getProfile.getFirstName(), equalTo(profile.getFirstName()));
		assertThat(getProfile.getLastName(), equalTo(profile.getLastName()));
		assertThat(getProfile.getCreatedBy(), equalTo(-1L));
		assertThat(SDF.format(getProfile.getCreationDate()), equalTo(SDF.format(new Date())));
		assertThat(SDF.format(getProfile.getLastModifiedDate()), equalTo(SDF.format(new Date())));
		assertThat(getProfile.getLastModifiedBy(), equalTo(-1L));
		assertThat(getProfile.getUserId(), equalTo(100L));
	}

}
