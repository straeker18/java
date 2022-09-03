public class punto12{
    public static void main(String[] args) {
        double salario_bruto, salario_neto, ret_fuente;
        salario_bruto = 48*5000;
        ret_fuente = salario_bruto*0.125;
        salario_neto = salario_bruto-ret_fuente;
        System.out.println("El salario bruto es: "+ salario_bruto);
        System.out.println("La retencion en la fuente es: "+ ret_fuente);
        System.out.println("El salario neto es: "+salario_neto);
    }

}