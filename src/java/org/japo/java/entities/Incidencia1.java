///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package org.japo.java.entities;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.Objects;
//import org.japo.java.libraries.UtilesDependencias;
//import org.japo.java.libraries.UtilesIncidencias1;
//import org.japo.java.libraries.UtilesUsuarios;
//
///**
// *
// * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
// */
//public final class Incidencia1 implements Serializable {
//
//    // Campos
//    private int id;
//    private String nombre;
//    private String info;
//    private int estado;
//    private Date creacion;
//    private int autor;
//    private String autorNombre;
//    private int dependencia;
//    private String dependenciaNombre;
//    private int especialidad;
//    private String especialidadNombre;
//
//    // Contrusctor predeterminado
//    public Incidencia1() {
//        id = UtilesIncidencias1.DEF_ID;
//        nombre = UtilesIncidencias1.DEF_NOMBRE;
//        info = UtilesIncidencias1.DEF_INFO;
//        estado = UtilesIncidencias1.DEF_ESTADO;
//        creacion = UtilesIncidencias1.DEF_CREACION;
//        autor = UtilesUsuarios.DEF_ID;
//        autorNombre = UtilesUsuarios.DEF_USER;
//        dependencia = UtilesDependencias.
////        this.id = id;
////        this.nombre = nombre;
////        this.info = info;
////        this.estado = estado;
////        this.creacion = creacion;
////        this.autor = autor;
////        this.autorNombre = autorNombre;
////        this.dependencia = dependencia;
////        this.dependenciaNombre = dependenciaNombre;
////        this.especialidad = especialidad;
////        this.especialidadNombre = especialidadNombre;
//
////////ACABAR
//    }
//
//    // Contructor parametrizado
//    public Incidencia1(int id, String nombre, String info) {
//        if (UtilesDependencias.validarId(id)) {
//            this.id = id;
//        } else {
//            this.id = UtilesDependencias.DEF_ID;
//        }
//        if (UtilesDependencias.validarNombre(nombre)) {
//            this.nombre = nombre;
//        } else {
//            this.nombre = UtilesDependencias.DEF_NOMBRE;
//        }
//        if (UtilesDependencias.validarInfo(info)) {
//            this.info = info;
//        } else {
//            this.info = UtilesDependencias.DEF_INFO;
//        }
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        if (UtilesDependencias.validarId(id)) {
//            this.id = id;
//        }
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        if (UtilesDependencias.validarNombre(nombre)) {
//            this.nombre = nombre;
//        }
//    }
//
//    public String getInfo() {
//        return info;
//    }
//
//    public void setInfo(String info) {
//        if (UtilesDependencias.validarInfo(info)) {
//            this.info = info;
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        boolean testOK = false;
//        if (o instanceof Incidencia1) {
//            Incidencia1 e = (Incidencia1) o;
//            testOK
//                    = id == e.getId()
//                    && nombre.equals(e.getNombre())
//                    && info.equals(e.getInfo());
//
//        }
//        return testOK;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 67 * hash + this.id;
//        hash = 67 * hash + Objects.hashCode(this.nombre);
//        hash = 67 * hash + Objects.hashCode(this.info);
//        return hash;
//    }
//
//}
