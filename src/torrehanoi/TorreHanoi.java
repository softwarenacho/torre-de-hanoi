package torrehanoi;

public class TorreHanoi{
        public int totalDiscos;
        
        public TorreHanoi (int discos){
            totalDiscos = discos;
        }
        
        public void solucion(){
            moverTorre(totalDiscos, 1, 3, 2);
        }
        
        private void moverTorre(int numeroDiscos, int inicio, int fin, int temp){
            if(numeroDiscos==1){
                instrucciones(inicio,fin);
            } else {
                moverTorre(numeroDiscos-1, inicio, temp, fin);
                instrucciones(inicio, fin);
                moverTorre(numeroDiscos-1, temp, fin, inicio);
            }
        }
        
        private void instrucciones(int inicio, int fin){
            System.out.println("Mover un disco desde " + inicio + " a " + fin);
        }
    }
