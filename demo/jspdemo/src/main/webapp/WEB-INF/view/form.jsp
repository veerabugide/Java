<html>
  <head>
    <style>
      form {
        background-color: skyblue;
        align-content: center;
        margin: auto;
        margin-top: 50px;
        border: solid;
        height: 200px;
        width: 500px;
      }
      label {
        margin: 30px;
      }
      .button {
        margin-left: 70px;
      }
      h1 {
        margin-top: 40px;
        margin-left: 500px;
        color: red;
      }
    </style>
  </head>
  <body>
    <h1>Student form</h1>
    <form action="save" modelAttribute="student">
      <label>student name</label>
      <input type="text" name="name" placeholder="name" /><br />
      <label>college name</label>
      <input type="text" name="college" placeholder="college" /><br />
      <label>Branch</label>
      <input
        type="text"
        name="branch"
        placeholder="name"
        style="margin-left: 40px"
        ;
      /><br />
      <label>Age</label>
      <input
        type="number"
        name="age"
        placeholder="age"
        style="margin-left: 60px"
      /><br />
      <button class="button">button</button>
    </form>
  </body>
</html>
