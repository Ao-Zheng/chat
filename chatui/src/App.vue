<template>
  <div id="app">
     <header><h1>留言板</h1></header>     
      <aside>

        <div class="asideIn">
          <h3 class="item"><router-link to="/allchat"><el-button type="primary">觀看留言</el-button></router-link></h3>
          <h3 class="item"><router-link to="/addchat"><el-button type="primary">新增留言</el-button></router-link></h3>
          <h3 class="item"><router-link to="/updatechat"><el-button type="primary">修改留言</el-button></router-link></h3>
          <h3 class="item"><router-link to="/deletechat"><el-button type="primary">刪除留言</el-button></router-link></h3>
        </div>

      </aside>
      <main><router-view></router-view></main>
      <footer><h1>GJUN</h1></footer>  

  </div>
</template>
<script></script>
<style>
@charset "UTF-8";
* {
  margin: 0;
  padding: 0;
}
body {
  width: 100%; 
  min-width: 600px; 
  max-width: 960px;		
  background: beige;
  margin: 0 auto;
}	
header {
  width: 100%;	  
  background: #0A2533;		
  text-align: center;
  color:white;
}	  
main {
  width: 70%;
  height: 300px;
  background: #99CFEA;
  float: right;	
}
aside {
  width: 28%;
  height: 300px;		
  background:#99CFEA;
  float: left;	
}
.asideIn{
  margin-left: 80px;
  margin-top: 30px;

}
.item{
  margin-top: 5px;
}
footer {
  width: 100%;
  background: #0A2533;		
  clear: both;   
  text-align: center;   
  color:white  
}	  
</style>