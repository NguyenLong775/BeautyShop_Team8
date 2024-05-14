package hcmutenhom8.utils;

import org.apache.commons.io.FilenameUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadUtils {
    public static String processUpload(String fileName, HttpServletRequest req, String storeFolder, String storeFileName) throws IOException, ServletException {
        Part filePart = req.getPart(fileName);
        if(filePart == null || filePart.getSize() == 0) {
            return "";
        }
        if(storeFolder == null) {
            storeFolder = constant.DIR;
        }
        if(storeFileName == null) {
            storeFileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        }
        else {
            storeFileName += "." + FilenameUtils.getExtension(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());

        }
        Path uploadPath = Paths.get(storeFolder);
        if(!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        filePart.write(Paths.get(uploadPath.toString(), storeFileName).toString());
        return storeFileName;
    }
}
