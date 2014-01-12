<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title> Agregar Cliente </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <%@include file="/public/menuGeneral.jsp" %>

        <div class="container-fluid">
            <div class="row-fluid">
                <%@include file="/public/menuAdm.jsp" %>
                <div class="span9">
                    <div class="row">
                        <h1> Nuevo Cliente </h1>
                    </div>

                    <div class="row">

                        <form action="<%=contextPath%>/adm/admin/save" method="POST" class="form-horizontal">
                            <div class="span5">

                                <input type="hidden" value="${admin.id}" name="id">

                                <div class="control-group">
                                    <label class="control-label">Nombres</label>
                                    <div class="controls">
                                        <input type="text" name="nombres" value="${admin.nombres}">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label">Categoria</label>
                                    <div class="controls">
                                        <select>
                                            <option>Seleccionar</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label">Imagen</label>
                                    <div class="controls">
                                        <input type="file"/>
                                    </div>
                                </div>


                                <div class="control-group">
                                    <label class="control-label">Stock</label>
                                    <div class="controls">
                                        <input type="text" name="email" placeholder="Numero de Unidades" value="${admin.email}">
                                    </div>
                                </div>


                                <div class="control-group">
                                    <label class="control-label">Precio Compra</label>
                                    <div class="controls">
                                        <input type="text" name="celular" placeholder="S/." value="${admin.celular}">
                                    </div>
                                </div>


                                <div class="control-group">
                                    <label class="control-label">Precio Venta</label>
                                    <div class="controls">
                                        <input type="text" name="direccion" placeholder="S/." value="${admin.direccion}">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label">Garantia</label>
                                    <div class="controls">
                                        <input type="text" name="direccion" placeholder="Garantia en Meses" value="${admin.direccion}">
                                    </div>
                                </div>


                                <div class="control-group">
                                    <label class="control-label">Estado</label>
                                    <div class="controls">
                                        <select>
                                            <option>Seleccionar</option>
                                            <option>Activo</option>
                                            <option>Inactivo</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <div class="controls">
                                        <a class="btn" href="<%=contextPath%>/adm/admin">Cancelar</a>
                                        <button type="submit" class="btn btn-primary">Guardar</button>
                                    </div>
                                </div>

                            </div>
                            <div class="span4">
                                <div class="control-group">
                                    <label class="control-label">Descripcion</label>
                                    <div class="controls">
                                        <textarea rows="25" placeholder="Descripcion, Especificacion y Detalles del Producto" maxlength="10000"></textarea>
                                    </div>
                                </div> 
                            </div>
                        </form>
                    </div>

                </div>
            </div>
            <hr>
        </div>
        <%@include file="/public/footer.jsp" %>
    </body>
</html>