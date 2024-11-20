<template>
    <div class="com1">
      <el-input v-model="name" placeholder="留言者"></el-input>
      <el-input v-model="subject" placeholder="主題"></el-input>       
        <el-input v-model="content" placeholder="留言內容"></el-input>
        <el-button type="primary" @click="add">送出</el-button>
        <hr>
        {{ message }}
    </div>
  
  </template>
  <script>
    import axios from 'axios'
    export default{
        name:'AddChat',
        data(){
          return {
            name:'',
            subject:'',
            content:'',
            message:''
          }
        },
        methods:{
          add()
          {
            let data={
              "name":this.name,
              "subject":this.subject,
              "content":this.content
            };
            let url="http://10.10.2.21:8080/chat/AddChat";

            axios
            .post(url,data)
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