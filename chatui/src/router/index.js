import {createRouter,createWebHistory} from 'vue-router'
import AddChat from '@/components/AddChat.vue'
import AllChat  from '@/components/AllChat.vue'
import UpdateChat from '@/components/UpdateChat.vue'
import DeleteChat from '@/components/DeleteChat.vue'


const routes=[
    {path:'/addchat',component:AddChat},
    {path:'/allchat',component:AllChat},
    {path:'/updatechat',component:UpdateChat},
    {path:'/deletechat',component:DeleteChat},
];

const router=createRouter({
    history:createWebHistory(),
    routes
});


export default router;