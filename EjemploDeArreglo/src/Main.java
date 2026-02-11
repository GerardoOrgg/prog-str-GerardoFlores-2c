public class Main {
    public static void main(String[] args) {
        //Declaracion

        int[] arr;

        int[] arr1 = new int[4]; //Inicializado
        int[] arr2 = {1, 2, 3, 4};

        //acesso
        System.out.println(arr1[0]);
        System.out.println("__________________________");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("__________________________");
        for(int numero :arr1){
            System.out.println(numero);
        }

        Persona[] personas = new Persona[3];
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(2 ,"Gerardo");
        Persona persona3 = new Persona(3, "Flores");

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;

        personas[0]= null;

        for (Persona persona: personas){

            try {
                //System.out.println(persona);
                System.out.println("_________________");
                System.out.println(persona.getId());
                System.out.println(persona.getName());
                System.out.println(persona.isActive());
            } catch (Exception e) {
                System.out.println("Hay un nulo");
            }

        }




    }
}
