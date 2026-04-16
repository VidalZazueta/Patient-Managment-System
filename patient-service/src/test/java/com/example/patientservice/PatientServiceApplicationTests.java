package com.example.patientservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Note that when the H2 Console is boot up, it will reload the data.sql file again
// So the patient-service endpoint tests will reset
@SpringBootTest
class PatientServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
