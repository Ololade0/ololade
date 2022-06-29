package HospitalManagementSystem;

public class BodyTest {
    BodyTest blood;
    private String typeOfBloodTestName;
    private String testResult;

    public BodyTest(String typeOfBloodTest, String testResult){
        this.typeOfBloodTestName = typeOfBloodTest;
        this.testResult = testResult;
    }


    public String getTypeOfBloodTestName() {
        return typeOfBloodTestName;
    }

    public String getTestResult() {
        return testResult;
    }
}
