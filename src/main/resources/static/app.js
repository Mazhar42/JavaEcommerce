//fetch("http://localhost:8080/api/v1/products")
//    .then((response) => response.json())
//    .then(data => {
//        const products = document.getElementById('product-container')
//        data.forEach((item)=>{
//            const product = document.createElement('div')
//            product.classList.add('product')
//            const name = document.createElement('h3')
//            name.innerHTML = item.name
//            product.appendChild(name)
//            const categories = document.createElement('h4')
//            categories.innerHTML = item.categories
//            product.appendChild(categories)
//            const price = document.createElement('p')
//            price.innerHTML = "$"+ item.price
//            product.appendChild(price)
//            const btn = document.createElement('a')
//            btn.classList.add('btn')
//            btn.innerHTML = "Add To Cart"
//            product.appendChild(btn)
//            products.appendChild(product)
//            console.log(item)
//        })
//    }
//)
