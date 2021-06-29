import java.io.*;
import java.nio.file.Files;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "FileUploadServlet", urlPatterns = {"/fileuploadservlet"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
        maxFileSize = 1024 * 1024 * 10,      // 10 MB
        maxRequestSize = 1024 * 1024 * 100   // 100 MB
)
public class FileUploadServlet extends HttpServlet {
    private String path = "D:\\tryfolder";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var theDir = new File(path);
        if (!theDir.exists()) theDir.mkdirs();
        /* Receive file uploaded to the Servlet from the HTML5 form */
        Part filePart = request.getPart("file");
        String fileName = filePart.getSubmittedFileName();
        for (Part part : request.getParts()) {
            part.write(path + "\\" + fileName);
        }
        response.getWriter().print("The file uploaded sucessfully.");
    }
}
