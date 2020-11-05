<template>


    <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Registration Info</h2>
                  <!--  <action="POST">-->
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Name" name="name">
                        </div>
                       
                </div>
            </div>
            <div class="input-group">
                <input class="input--style-3" type="email" placeholder="Email" name="email">
            </div>
              <div class="input-group">
                <input class="input--style-3" type="password" placeholder="Password" name="email">
            </div>
            <div class="input-group">
                <input class="input--style-3" type="text" placeholder="Phone" name="phone">
            </div>
            <div class="p-t-10">
                <button class="btn btn--pill btn--green" type="submit">Submit</button>
            </div>
          

    </div>
    </div>
   
</template>

<script>
// import router from "../router"    
    import axios from "axios"    
    export default {    
        name: "Hello",    
        methods: {    
            login: (e) => {    
                e.preventDefault()  
                let name = "Nessa"   
                
                let email = "user@email.com" 
                let password = "password"       
                let phoneNumber = "0123456"   
                   
                let login = () => {    
                    let data = {  
                        name:name,

                        email: email,    
                        password: password  ,
                        phoneNumber:phoneNumber  
                    }    
                    axios.post("/api/v1/employee/addEmployee", data)    
                        .then(() => {    
                            console.log("Successfully added.")    
                            //router.push("/dashboard")    
                        })    
                        .catch(() => {    
                            console.log("Action failed.")    
                        })    
                }    
                login()    
            }    
        }    
    }

    </script>