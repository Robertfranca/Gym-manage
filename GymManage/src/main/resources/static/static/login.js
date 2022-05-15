const button= document.getElementById('button')

button.addEventListener('click', (event) => {
    event.preventDefault()
    const password= document.getElementById('password')
    const email= document.getElementById('email')

    if(password.value == ''){
        password.classList.add("erroInput")
    }else{
        password.classList.remove("erroInput") 
    }

    if(email.value == ''){
        email.classList.add("erroInput")
    }else{
        email.classList.remove("erroInput")
    }

    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 || (email.value.indexOf('.') - email.value.indexOf('@') == 1)){
        email.classList.add("erroInput")
    }

})
