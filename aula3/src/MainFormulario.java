import java.text.Normalizer;

public class MainFormulario {
    public static void main(String[] args) {
        FormularioBanco form = new FormularioBanco(
            "nome",
            "cpf",
            "telefone",
            "email",
            "endereco",
            10
        );

        form.printForm();

    }
}
