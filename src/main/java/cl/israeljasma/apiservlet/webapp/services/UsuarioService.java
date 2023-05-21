package cl.israeljasma.apiservlet.webapp.services;

import cl.israeljasma.apiservlet.webapp.models.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> getById(int id);
}
