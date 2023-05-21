package cl.israeljasma.apiservlet.webapp.services;

import cl.israeljasma.apiservlet.webapp.models.Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.Optional;

public class LoginServiceImpl implements LoginService{
    @Override
    public Optional<Usuario> getUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Usuario user = (Usuario) session.getAttribute("user");
        if (user != null) {
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
