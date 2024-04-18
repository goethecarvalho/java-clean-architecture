package br.com.alura.codechella.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.entities.usuario.FabricaDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-99", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Clarice", "123.456.789-01", LocalDate.parse("2014-01-08"));

        Assertions.assertEquals("Clarice",usuario.getNome());

        usuario = fabrica.incluirEndereco("60192-022", 40, "apto 201");

        Assertions.assertEquals("apto 201", usuario.getEndereco().getComplemento());
    }
}
