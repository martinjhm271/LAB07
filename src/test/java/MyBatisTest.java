
import edu.eci.pdsw.samples.entities.EntradaForo;
import edu.eci.pdsw.samples.persistence.DaoFactory;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.persistence.mybatisimpl.mappers.EntradaForoMapper;
import static edu.eci.pdsw.samples.textview.MyBatisExample.getSqlSessionFactory;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2105537
 */
public class MyBatisTest {
    
    @Before
    public void setUp(){
    
    }
    
    @Test
    public void EntradasForosinComentarios() throws SQLException, PersistenceException{
        SqlSessionFactory sessionfact = getSqlSessionFactory();

        SqlSession sqlss = sessionfact.openSession();

        EntradaForoMapper pedmp=sqlss.getMapper(EntradaForoMapper.class);
        System.out.println(pedmp.getEntradaForo(4));
    
    }
    
}
