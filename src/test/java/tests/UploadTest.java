package tests;

import org.testng.annotations.Test;

import java.io.File;

public class UploadTest extends BaseTest {

    private static final String UPLOAD_FILE_PATH = "src/test/resources/UploadFile";
    private static final File UPLOAD_ABSOLUTE_PATH = new File(UPLOAD_FILE_PATH);

    @Test
    public void verifyUploadFile() {
        uploadPage.openPage();
        uploadPage.validateFileUpload(UPLOAD_ABSOLUTE_PATH.getAbsolutePath());
        uploadPage.validateUploadedFileLink();
    }
}
