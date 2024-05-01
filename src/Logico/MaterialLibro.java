package Logico;
import java.sql.Connection;
import Clases.MaterialLibroClases;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Laura Pineda
 */
public class MaterialLibro {

    private Connection conexion;
    
    public MaterialLibro(Connection conexion){
        this.conexion = conexion;
    }
    
    //insertar material
    
    public boolean insertarMaterialLibro (MaterialLibroClases MaterialLibro){
         boolean rowInserted = false;
         
         try {
             String sql = "INSERT INTO libros (idInterno, titulo, autor"
                     + "numPaginas, editorial, ISBN, yearPubli, uniDispo) "
                     + "VALUES (?,?,?,?,?,?)";
             java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
             
             statement.setString(1, MaterialLibro.getidInterno());
             statement.setString(2, MaterialLibro.gettitulo());
             statement.setString(3, MaterialLibro.getautor());
             statement.setInt(4, MaterialLibro.getnumPaginas());
             statement.setString(5, MaterialLibro.geteditorial());
             statement.setString(1, MaterialLibro.getidInterno());
             
             rowInserted = statement.executeUpdate() > 0;
            statement.close();
         }catch(SQLException ex){
            Logger.getLogger(MaterialLibroClases.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rowInserted;
    }
    
}
