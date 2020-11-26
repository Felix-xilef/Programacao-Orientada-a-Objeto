/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_3;

import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author Felix Petiz Bonilho
 */
public interface DAO<BEAN> {
    public boolean insere(BEAN dado) throws SQLException;
    public boolean remover(BEAN dado) throws SQLException;
    public boolean alterar(BEAN dado) throws SQLException;
    public BEAN buscarID(BEAN dado) throws SQLException;
    public Collection<BEAN> listar(String criterio) throws SQLException;
}