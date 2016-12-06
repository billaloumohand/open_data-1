<html>
<body>
<h2>Hello World!  S </h2>

            <% 
            String attribut = (String) request.getAttribute("test");
            out.println( attribut );
            out.println( "Ceci est un test ");
            %>
</body>
</html>
