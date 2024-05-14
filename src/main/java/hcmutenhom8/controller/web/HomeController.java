package hcmutenhom8.controller.web;

import hcmutenhom8.model.AccountModel;
import hcmutenhom8.service.IAccountService;
import hcmutenhom8.service.impl.AccountService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/trang-chu", "/reset-pass"})
public class HomeController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    IAccountService service = new AccountService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        if (url.contains("trang-chu")) {
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
            rd.forward(req, resp);
        }
        if (url.contains("reset-pass")) {
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/reset-pass.jsp");
            rd.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        if (url.contains("reset")) {
            resetPass(req, resp);
        }
    }

    private void resetPass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String sdt = req.getParameter("sdt");
        AccountModel account = service.findOneByUsername(username);
        if (service.findOneByUsername(username) == null) {
            req.setAttribute("note", "Tên tài khoản không tồn tại!!");
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/reset-pass.jsp");
            rd.forward(req, resp);
        } else if (sdt.equals(account.getSdt())) {
            String pass = account.getPassWord();
            req.setAttribute("note", "Mật khẩu của bạn là: " + pass);
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
            rd.forward(req, resp);
        } else {
            req.setAttribute("note", "Thông tin không hợp lệ");
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
            rd.forward(req, resp);
        }
    }
}
