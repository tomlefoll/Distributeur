### Cours complet pour implémenter un distributeur automatique avec un système de paiement

Dans ce cours, nous allons créer un programme de distributeur automatique en Java. L'objectif est d'implémenter un système où un utilisateur peut choisir un produit à acheter, effectuer un paiement, et voir combien d'argent il lui reste après l'achat. Nous commencerons par le code de base et ajouterons des fonctionnalités étape par étape.

### Objectifs du programme :
1. **Permettre à l'utilisateur de choisir un produit parmi plusieurs.**
2. **Vérifier si l'utilisateur a suffisamment d'argent pour acheter le produit.**
3. **Deducter le montant du produit acheté de l'argent de poche de l'utilisateur.**
4. **Afficher l'argent restant après l'achat.**

---

### Étape 1 : Initialisation des variables

#### 1.1 Définition des produits

Le distributeur propose plusieurs produits comme le café, le soda, les cookies, etc. Chaque produit aura une valeur associée (par exemple, le prix du café est 2 euros). Nous devons donc définir ces produits comme des variables et leur attribuer un prix.

```java
// Liste des produits
int cafe = 1;
int cookie = 2;
int soda = 3;
int the = 4;
int chocolat = 5;
int eau = 6;
int siropDeFraise = 7;
```

Ici, chaque produit a un numéro unique qui servira à l'utilisateur pour choisir un produit dans le menu.

#### 1.2 Définition des prix des produits

Ensuite, chaque produit a un prix. Nous créons des variables pour ces prix. Imaginons les prix suivants :

- Café = 2 €
- Cookie = 3 €
- Soda = 1 €
- Thé = 2 €
- Chocolat = 4 €
- Eau = 1 €
- Sirop de fraise = 3 €

```java
// Prix des produits
int prixCafé = 2;
int prixCookie = 3;
int prixSoda = 1;
int prixThé = 2;
int prixChocolat = 4;
int prixEau = 1;
int prixSiropDeFraise = 3;
```

#### 1.3 Argent de poche de l'utilisateur

Nous initialisons l'argent de poche de l'utilisateur à 100 € pour commencer.

```java
int argentDePoche = 100;
```

---

### Étape 2 : Choisir un produit

Nous avons besoin d'un moyen pour l'utilisateur de choisir un produit. Pour cela, nous allons utiliser un objet `Scanner` qui nous permettra de lire l'entrée de l'utilisateur. Le programme affichera un menu avec les différents produits, et l'utilisateur pourra entrer un numéro pour choisir un produit.

```java
Scanner input = new Scanner(System.in);  // Initialisation du scanner
System.out.println("Choisissez votre article : ");
System.out.println("1. Café");
System.out.println("2. Cookie");
System.out.println("3. Soda");
System.out.println("4. Thé");
System.out.println("5. Chocolat");
System.out.println("6. Eau");
System.out.println("7. Sirop de fraise");

// Lecture du choix de l'utilisateur
int userInput = input.nextInt();
```

Le programme demande à l'utilisateur de saisir un nombre entre 1 et 7 pour choisir un produit. Le choix sera stocké dans la variable `userInput`.

---

### Étape 3 : Traitement du choix de l'utilisateur

Ensuite, nous devons traiter le choix de l'utilisateur. Cela se fait à l'aide d'un `switch`, où chaque `case` correspond à un produit. Pour chaque produit, nous vérifions si l'utilisateur a assez d'argent et, si c'est le cas, nous déduisons le prix du produit de son argent de poche. Sinon, nous lui affichons un message lui indiquant qu'il n'a pas assez d'argent.

```java
switch(userInput) {
    case 1:  // Café
        if (argentDePoche >= prixCafé) {
            argentDePoche -= prixCafé;  // Déduction du prix
            System.out.println("Votre café est prêt ! Vous avez payé " + prixCafé + "€. Il vous reste " + argentDePoche + "€.");
        } else {
            System.out.println("Désolé, vous n'avez pas assez d'argent pour un café. Il vous manque " + (prixCafé - argentDePoche) + "€.");
        }
        break;

    case 2:  // Cookie
        if (argentDePoche >= prixCookie) {
            argentDePoche -= prixCookie;
            System.out.println("Les cookies sont prêts ! Vous avez payé " + prixCookie + "€. Il vous reste " + argentDePoche + "€.");
        } else {
            System.out.println("Désolé, vous n'avez pas assez d'argent pour des cookies. Il vous manque " + (prixCookie - argentDePoche) + "€.");
        }
        break;

    case 3:  // Soda
        if (argentDePoche >= prixSoda) {
            argentDePoche -= prixSoda;
            System.out.println("Votre soda est très froid ! Vous avez payé " + prixSoda + "€. Il vous reste " + argentDePoche + "€.");
        } else {
            System.out.println("Désolé, vous n'avez pas assez d'argent pour un soda. Il vous manque " + (prixSoda - argentDePoche) + "€.");
        }
        break;

    case 4:  // Thé
        if (argentDePoche >= prixThé) {
            argentDePoche -= prixThé;
            System.out.println("Votre thé est prêt ! Vous avez payé " + prixThé + "€. Il vous reste " + argentDePoche + "€.");
        } else {
            System.out.println("Désolé, vous n'avez pas assez d'argent pour un thé. Il vous manque " + (prixThé - argentDePoche) + "€.");
        }
        break;

    case 5:  // Chocolat
        if (argentDePoche >= prixChocolat) {
            argentDePoche -= prixChocolat;
            System.out.println("Votre chocolat est prêt ! Vous avez payé " + prixChocolat + "€. Il vous reste " + argentDePoche + "€.");
        } else {
            System.out.println("Désolé, vous n'avez pas assez d'argent pour du chocolat. Il vous manque " + (prixChocolat - argentDePoche) + "€.");
        }
        break;

    case 6:  // Eau
        if (argentDePoche >= prixEau) {
            argentDePoche -= prixEau;
            System.out.println("Votre eau est prête ! Vous avez payé " + prixEau + "€. Il vous reste " + argentDePoche + "€.");
        } else {
            System.out.println("Désolé, vous n'avez pas assez d'argent pour de l'eau. Il vous manque " + (prixEau - argentDePoche) + "€.");
        }
        break;

    case 7:  // Sirop de fraise
        if (argentDePoche >= prixSiropDeFraise) {
            argentDePoche -= prixSiropDeFraise;
            System.out.println("Votre sirop de fraise est prêt ! Vous avez payé " + prixSiropDeFraise + "€. Il vous reste " + argentDePoche + "€.");
        } else {
            System.out.println("Désolé, vous n'avez pas assez d'argent pour du sirop de fraise. Il vous manque " + (prixSiropDeFraise - argentDePoche) + "€.");
        }
        break;

    default:  // Cas où l'utilisateur entre un choix invalide
        System.out.println("Choix invalide. Veuillez choisir un numéro entre 1 et 7.");
        break;
}
```

### Explication de chaque section du `switch` :
- **Chaque `case`** : Correspond à un produit que l'utilisateur peut choisir.
- **Vérification de l'argent** : Avant d'effectuer l'achat, le programme vérifie si l'utilisateur a assez d'argent. Si c'est le cas, le prix du produit est déduit de l'argent de poche.
- **Message d'erreur** : Si l'utilisateur n'a pas assez d'argent, un message lui explique combien il lui manque.
- **Solde restant** : Après l'achat, le programme affiche combien d'argent il reste à l'utilisateur.

---

### Étape 4 : Finalisation du programme

Une fois que l'achat a été effectué (ou si l'utilisateur n'a pas assez d'argent), le programme se termine. Pour éviter les fuites de mémoire, il est important de fermer le `Scanner` à la fin.

```java
// Fermeture du scanner pour éviter les fuites de mémoire
input.close();
```

---

### Résumé des étapes :

1. **Initialisation des produits et des prix** : Définition des produits disponibles et de leurs prix.
2. **Choix du produit** : L'utilisateur choisit un produit via un numéro.
3. **Vérification de l'argent** : Le programme vérifie si l'utilisateur a suffisamment d'argent.
4. **Effectuer l'achat** : Si l'utilisateur a assez d'argent, il peut acheter l'article. Sinon, il reçoit un message d'erreur.
5. **Afficher l'argent restant** : Après l'achat, le solde restant de l'utilisateur est affiché.

### Conclusion :

À ce stade, vous avez mis en place un simple système de distributeur automatique où un utilisateur peut acheter des articles en fonction de l'argent dont il dispose. Vous pouvez maintenant développer ce programme en ajoutant d'autres fonctionnalités, comme des remises ou des offres spéciales.
