package br.sc.senai.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (Objects.equals(usuario, "admin") && Objects.equals(senha, "1234")) {
            out.println("<h3>Login efetuado com sucesso!</h3>");
        } else {
            out.println("<h3>Usuário e/ou senha inválidos!</h3>");
        }

        out.close();
    }
}
