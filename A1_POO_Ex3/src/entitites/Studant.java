package entitites;

public class Studant {
    private String nome;
    private float nota1 = 0;
    private float nota2 = 0;
    private float nota3 = 0;
    private final int notaMax1 = 30;
    private final int notaMax2 = 35;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(float nota1) {
        if(nota1 > 30){
            throw new RuntimeException(" Falha. Nota máxima do primeiro semestre é 30.");
        }else if(nota1 < 0){
            throw new RuntimeException(" Falha. Nota mínima do primeiro semestre é 0.");
        }else this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        if(nota2 > 35){
            throw new RuntimeException(" Falha. Nota máxima do segundo semestre é 35.");
        }else if(nota2 < 0){
            throw new RuntimeException(" Falha. Nota mínima do semestre é 0.");
        }else this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        if(nota3 > 35){
            throw new RuntimeException(" Falha. Nota máxima do terceiro semestre é 35.");
        }else if(nota3 < 0){
            throw new RuntimeException(" Falha. Nota mínima do semestre é 0.");
        }else this.nota3 = nota3;
    }

    public String pass1(){
        if(nota1 < 18){
            return "Studant " + getNome() + " Failed 1º semester missing " + (18 - nota1) + " points." ;
        }else return "Studant " + getNome() +" Passed 1º semester!";
    }

    public String pass2(){
        if(nota2 < 21){
            return "Studant " + getNome() + " Failed 2º semester missing " + (21 - nota2) + " points." ;
        }else return "Studant " + getNome() +" Passed 2º semester!";
    }

    public String pass3(){
        if(nota3 < 21){
            return "Studant " + getNome() + " Failed 3º semester missing " + (21 - nota3) + " points." ;
        }else return "Studant " + getNome() +" Passed 3º semester!";
    }

}
