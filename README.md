# OT183-server
<hr>
<p>NOTE: the proyect contens seeders to test the endpoints.</p>
<ul>Will add to the database the followings:
    <li>Activities</li>
<li>Catergories</li>
<li>Users, in this case, the following table show them with their roles.</li>
</ul>
<h3>Users</h3>
<table >
<thead>
<td>ID</td>
<td>TIPO</td>
<td>EMAIL</td>
<td>PASSWORD</td>
</thead>
  <tr>
    <td>1</td>
    <td>USER</td>
    <td>adriana.sanchez@gmail.com</td>
    <td>123456789</td>
  </tr>
  <tr>
    <td>2</td>
    <td>USER</td>
    <td>andrea.acevedo@gmail.com</td>
    <td>123456789</td>
  </tr>
  <tr>
    <td>3</td>
    <td>USER</td>
    <td>andres.blanco@gmail.com</td>
    <td>123456789</td>
  </tr>
  <tr>
    <td>4</td>
    <td>ADMIN</td>
    <td>daniel.ruiz@gmail.com</td>
    <td>123456789</td>
  </tr>
  <tr>
    <td>5</td>
    <td>ADMIN</td>
    <td>diana.alfonso@gmail.com</td>
    <td>123456789</td>
  </tr>
  <tr>
    <td>6</td>
    <td>ADMIN</td>
    <td>diego.guzman@gmail.com</td>
    <td>123456789</td>
  </tr>
</table>
<hr>
<p><b>Note:</b> to send emails the app use SendGrid, please, make sure to configure it before run the app.</p>
<p><b>Note:</b> to manage images the app works with AWS S3, please, make sure to configure it before run the app.</p>