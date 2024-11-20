<template>
   <div class="com">
        <el-table :data="currentTableData" border style="width: 100%">
            <el-table-column prop="id" label="id" ></el-table-column>
            <el-table-column prop="name" label="留言者" ></el-table-column>
            <el-table-column prop="subject" label="留言主題"></el-table-column>
            <el-table-column prop="content" label="留言內容"></el-table-column>
        </el-table>
        <div style="margin-top: 20px; text-align: right;" class="com2">
            <el-pagination
                 @size-change="handleSizeChange"
                 @current-change="handleCurrentChange"
                :current-page="currentPage"                
                :page-size="pageSize"
                layout="total,  prev, pager, next, jumper"
                :total="info.length"
            >

        </el-pagination>
        </div>
   
    </div>
  </template>
  <script>
  import axios from 'axios'
    export default{
        name:'AllChat',
        data(){
            return {
                info:[],
                currentPage: 1,
                pageSize: 5,
            }
        },
        mounted(){
            axios
            .get("http://10.10.2.21:8080/chat/AllChat")
            .then(response=>this.info=response.data)
            .catch(function(error){
                console.log(error);
            })

        },
        computed:{
            currentTableData() {
                        const start = (this.currentPage - 1) * this.pageSize;
                        const end = this.currentPage * this.pageSize;
                        return this.info.slice(start, end);
                        },
        },
        methods:{
            handleSizeChange(val) {
                    this.pageSize = val;
                    this.currentPage = 1; // 重置到第一頁
                },
                handleCurrentChange(val) {
                     this.currentPage = val;
                },
        }
        
    }
</script>
  <style>
    .com{
        width:80%;
        margin-left: 10%;
        margin-top: 5px;
    }
    .com2
    {
        width: 90%;
        margin-left: 5%;
    }
</style>