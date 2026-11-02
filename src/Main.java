//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    byte idade = 18;

    if (idade <= 10){
        IO.println("Criança");
    } else if (idade <= 17){
        IO.println("Adolescente");
    } else {
        IO.println("Adulto");
    }
}