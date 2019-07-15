package br.com.ndartificer.gerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ndartificer.gerenciadortarefas.modelos.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
		
	Usuario findByEmail(String email);

}
