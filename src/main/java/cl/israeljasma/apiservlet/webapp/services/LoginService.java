package cl.israeljasma.apiservlet.webapp.services;

import cl.israeljasma.apiservlet.webapp.models.Usuario;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public interface LoginService {
    Optional<Usuario> getUser(HttpServletRequest request);
}
