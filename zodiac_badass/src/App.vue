<template>
  <div id="app">
    <img alt="Reg logo" src="./assets/logo.png">
    <Home msg="Home Page!"/>
  </div>
</template>

<script>
import Home from './components/Home.vue'

export default {
  name: 'App',
  components: {
    Home
  }
}
</script>

<style>
</style>
