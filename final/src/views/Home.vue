<template>
  <div class="home">
    <img alt="Reg" src="../assets/logo.png">
    <Hello msg="Welcome to Registration Portal"/>
  </div>
</template>

<script>
// @ is an alias to /src
import Hello from '@/components/Hello.vue'

export default {
  name: 'Home',
  components: {
    Hello
  }
}
</script>
