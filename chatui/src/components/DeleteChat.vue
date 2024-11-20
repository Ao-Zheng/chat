<template>
    <div class="com1">
        <h3>刪除</h3>
        
              <el-input v-model="id" placeholder="請輸入ID"></el-input>      
              <el-button type="prmary" @click="Delete">送出</el-button>
       
        <hr>
        {{ message }}
        
    </div>
  
  </template>
  <script>
import axios from 'axios';

    export default{
        name:'DeleteChat',
        data(){
          return {
            id:'',
            message:''
          }
        },
        methods:{
          Delete()
          {
            let Id=this.id;
            axios
            .delete("http://10.10.2.21:8080/chat/DeleteChat/"+Id)
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