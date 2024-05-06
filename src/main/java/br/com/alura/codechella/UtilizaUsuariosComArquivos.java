package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;
import java.util.Arrays;

public class UtilizaUsuariosComArquivos {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-01", "João", LocalDate.parse("2000-10-15"), "joao@email.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-01", "Maria", LocalDate.parse("2000-10-15"), "maria@email.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-01", "Pedro", LocalDate.parse("2000-10-15"), "pedro@email.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-01", "Ana", LocalDate.parse("2000-10-15"), "ana@email.com"));

        repositorioDeUsuarioEmArquivo.gravaEmArquivo("usuarios.txt");
    }
}
