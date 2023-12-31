package Clases.Persona;
public class Arbitro extends Persona{

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // ATRIBUTOS
        private int PartidosArbitrados, TorneosArbitrados;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORES
        public Arbitro(Persona NuevaPersona){
            super(NuevaPersona);
            PartidosArbitrados=0;
            TorneosArbitrados=0;
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // METODOS
        public void AumentarPartidosArbitros(){
            PartidosArbitrados++;
        }
        public void AumentarTorneosArbitros(){
            TorneosArbitrados++;
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // OVERRIDES
        @Override
        public String toString() {
            return "Arbitro{" +
                    "PartidosArbitrados=" + PartidosArbitrados +
                    ", TorneosArbitrados=" + TorneosArbitrados +
                    ", Nombre='" + Nombre + '\'' +
                    ", Apellido='" + Apellido + '\'' +
                    ", Dni='" + Dni + '\'' +
                    ", Nacionalidad='" + Nacionalidad + '\'' +
                    ", Fecha_Nacimiento=" + Fecha_Nacimiento +
                    '}';
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // RETORNADORES GETTERS SETTERS
        public int getPartidosArbitrados() {
            return PartidosArbitrados;
        }
        public int getTorneosArbitrados() {
            return TorneosArbitrados;
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}