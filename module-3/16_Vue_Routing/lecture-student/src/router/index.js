import Vue from 'vue';
import VueRouter from 'vue-router';
import ProductsList from '../components/ProductsList.vue';
import ProductDetail from '@/components/ProductDetail.vue';
import AddReview from '@/components/AddReview.vue';

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'listOfProducts',
    component: ProductsList
  },
  {
    path: '/products/:id',
    name: 'productDetail',
    component: ProductDetail
  },
  {
    path: '/products/:id/add-review',
    name: 'addReview',
    component: AddReview
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
