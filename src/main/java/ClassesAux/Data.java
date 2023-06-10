package ClassesAux;


import java.time.LocalDate;
import java.util.Calendar;

public final class Data {
    private int dia;
    private int mes;
    private int ano;
    private static String[] diasDaSemana = { "sábado", "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira",
    "sexta-feira" };
    private static String[] meses = { "janeiro", "fevereiro", "março", "abril", "maio", "junho",
    "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" };

    // construtor sem parametros, vai instanciar o obj com a data atual
    public Data() {
        LocalDate dataAtual = LocalDate.now();
         this.dia = dataAtual.getDayOfMonth();
         this.mes = dataAtual.getMonthValue();
         this.ano = dataAtual.getYear();
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

    public static int getAnoAtual() {
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        return anoAtual;
    }
    
    public boolean verificarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
            return false;
        }

        switch (mes) {
            case 2 -> {
                if (dia > 29 || (dia == 29 && !isAnoBissexto())) {
                    return false;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia > 30) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
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

    /**
     * @return int return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return int return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return int return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

}