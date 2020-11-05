<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/login">Login</router-link> |
      <router-link to="/About">About</router-link> |
      <router-link to="/ContactUs">ContactUs</router-link>

    </div>
    <router-view/>
  </div>
</template>

<style>
html, body{
  height: 100%;
}
body { 
			background-image: url(src/assets/logo.png) ;
			background-position: center center;
			background-repeat:  no-repeat;
			background-attachment: fixed;
			background-size:  cover;
			background-color: #999;
  
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color:#000000;

}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color:#000000;
}

#nav a.router-link-exact-active {
    color: #000000;
}
</style>
