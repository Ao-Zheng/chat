<template>
    <div class="com1">
        <h3>修改</h3>
        <el-input v-model="id" placeholder="輸入ID"></el-input>
        <el-input v-model="content" placeholder="輸入內容"></el-input>
        <el-button @click="update">送出</el-button>
        <hr>
        {{ message }}
    </div>
  
  </template>
  <script>
  import axios from 'axios'
    export default{
        name:'UpdateChat',
        data(){
          return {
            id:'',
            content:'',
            message:''
          }
        },
        methods:{
          update(){
            let Id=this.id;
            let Content=this.content;

            axios
            .put("http://10.10.2.21:8080/chat/UpdateChat/"+Id+"/"+Content)
            .then(response=>this.message=response.data)
            .catch(function(error){
              console.log(error);
            })
          }
        }
    }
</script>
 <style>
   .com1{
    width:70%;
    margin-left: 15%;
    margin-top: 20px;
  }
</style>