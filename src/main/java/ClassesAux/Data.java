package ClassesAux;

import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private static String[] diasDaSemana = { "sábado", "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira",
    "sexta-feira" };
    private static String[] meses = { "janeiro", "fevereiro", "março", "abril", "maio", "junho",
    "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" };

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int dia, int mes, int ano) {
        if (verificarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("data invalida");
        }
    }

    public Data(Data date) {
        if (verificarData(date.dia, date.mes, date.ano)) {
            this.dia = date.dia;
            this.mes = date.mes;
            this.ano = date.ano;
        } else {
            System.out.println("data invalida");
        }
    }

    public boolean verificarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
            return false;
        }

        switch (mes) {
            case 2:
                if (dia > 29 || (dia == 29 && !isAnoBissexto())) {
                    return false;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30) {
                    return false;
                }
                break;
        }

        return true;
    }

    private boolean isAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        }
        return false;
    }
    
    public String dayOfWeek() {
        int q = dia;
        int m = mes;
        int y = ano;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        return diasDaSemana[h];
    }

    public String imprimirData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public String imprimirDataExtenso() {
        return this.dia + " de " + meses[this.mes] + " de " + this.ano;
    }

    public static Data getDataAtual() {
        LocalDate dataAtual = LocalDate.now();
        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();

        return new Data(dia, mes, ano);
    }
}
