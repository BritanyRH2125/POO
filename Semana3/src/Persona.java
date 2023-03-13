public class Persona {
        private String nombre;
        private int edad;
        private boolean mayorEdad;

        public Persona(String nombre, int edad, boolean mayorEdad) {
                this.nombre = nombre;
                this.edad = edad;
                this.mayorEdad = mayorEdad;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }

        public boolean isMayorEdad() {
                return mayorEdad;
        }

        public void setMayorEdad(boolean mayorEdad) {
                this.mayorEdad = mayorEdad;
        }

        @Override
        public String toString() {
                return "Persona{" +
                        "nombre='" + nombre + '\'' +
                        ", edad=" + edad +
                        ", mayorEdad=" + mayorEdad +
                        '}';
        }
}
