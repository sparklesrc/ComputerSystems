<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <%@include file="/public/header_home.jsp" %>
    </head>
    <body>
        <%@include file="/public/encabezado.jsp" %>
        <br>
        <br>


        <!-- Marketing messaging and featurettes
       ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">

            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="span4">
                    <!--img class="img-circle" src="<%=request.getContextPath()%>/img/Notebooks.jpg"-->



                    <h2>Portátiles</h2>
                    <p>A la Vanguardia de Notebooks. Encuentra Tablets y Dispositivos que estén al nivel de tus Necesidades.</p>
                    <p><a class="btn" href="#">Ver Ahora &raquo;</a></p>
                </div><!-- /.span4 -->




                <div class="span4">
                    <img class="img-circle" data-src="holder.js/140x140">
                    <h2>PC y Accesorios</h2>
                    <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                    <p><a class="btn" href="#">Ver Ahora &raquo;</a></p>
                </div><!-- /.span4 -->

                <div class="span4">
                    <img class="img-circle" data-src="holder.js/140x140">
                    <h2>Software</h2>
                    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                    <p><a class="btn" href="#">Ver Ahora &raquo;</a></p>
                </div><!-- /.span4 -->
            </div><!-- /.row -->

        </div><!-- /.container -->


        <%@include file="/public/footer.jsp" %>

</body>
</html>
