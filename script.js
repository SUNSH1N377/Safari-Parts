// Данные товаров (замените на свои данные)
const products = [
    {
        name: "Двигатель 2.0",
        price: 150000,
        image: "6.jpg"
    },
    {
        name: "Коробка передач",
        price: 80000,
        image: "1.jpg"
    },
    {
        name: "Диски тормозные",
        price: 10000,
        image: "4.jpg"
    },
    // ... еще товары
];

// Рендер товаров
const productsContainer = document.querySelector('.products-container');

products.forEach(product => {
    const productElement = document.createElement('div');
    productElement.classList.add('product');

    productElement.innerHTML = `
        <img src="${product.image}" alt="${product.name}">
        <h3>${product.name}</h3>
        <p>Цена: ${product.price} руб.</p>
        <button>Купить</button>
    `;

    productsContainer.appendChild(productElement);
});

// Рендер категорий (замените на свои данные)
const categoriesContainer = document.querySelector('.categories-container');

const categories = [
    {
        name: "Двигатели",
        link: "/category/engines"
    },
    {
        name: "Трансмиссия",
        link: "/category/transmissions"
    },
    // ... еще категории
];

categories.forEach(category => {
    const categoryElement = document.createElement('div');
    categoryElement.classList.add('category');

    categoryElement.innerHTML = `
        <h3>${category.name}</h3>
        <a href="${category.link}">Смотреть товары</a>
    `;

    categoriesContainer.appendChild(categoryElement);
});