/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayanimales;

import java.util.Date;

/**
 *
 * @author BraYan
 */
public class clsanimal {
    
    
    public enum verin {vertebrados, invertebrados};
    public enum ovima {oviparos, mamiferos};
    
    private int _id;
    private String _nombre;
    private float _valor;
    private Date _apareamiento;
    private float _peso;
    
    private verin _verin;
    private ovima _ovima;

    public clsanimal() {
    }

    public clsanimal(int _id, String _nombre, float _valor, Date _apareamiento, float _peso, verin _verin, ovima _ovima) {
        this._id = _id;
        this._nombre = _nombre;
        this._valor = _valor;
        this._apareamiento = _apareamiento;
        this._peso = _peso;
        this._verin = _verin;
        this._ovima = _ovima;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float Valor() {
        return _valor;
    }

    public void Valor(float _valor) {
        this._valor = _valor;
    }

    public Date Apareamiento() {
        return _apareamiento;
    }

    public void Apareamiento(Date _apareamiento) {
        this._apareamiento = _apareamiento;
    }

    public float Peso() {
        return _peso;
    }

    public void Peso(float _peso) {
        this._peso = _peso;
    }

    public verin Verin() {
        return _verin;
    }

    public void Verin(verin _verin) {
        this._verin = _verin;
    }

    public ovima Ovima() {
        return _ovima;
    }

    public void Ovima(ovima _ovima) {
        this._ovima = _ovima;
    }
    
    
    
    
}
