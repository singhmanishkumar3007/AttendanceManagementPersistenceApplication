package com.easybusiness.attendancepersistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easybusiness.attendancepersistence.user.UserDao;
import com.easybusiness.attendancepersistence.userdeviceeffort.UserDeviceEffortDao;

@SpringBootApplication
public class AttendancePersistenceApplication implements CommandLineRunner {
    @Autowired
    UserDao userDao;

    @Autowired
    UserDeviceEffortDao userGroupMapDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(AttendancePersistenceApplication.class);

    public static void main(String[] args) {
	SpringApplication.run(AttendancePersistenceApplication.class, args);
	LOGGER.info("inside Attendance Persistence App");

    }

    @Override
    public void run(String... args) throws Exception {
	LOGGER.info("inside run");

    }

}
