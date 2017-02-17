package edu.jalc.inclass.cocacola.recipe.store;



/*

		This is a store of secret recipes.

		There can only be one instance of the store!
		The store houses a collection of recipes that require a pin number to access.
		This pin number belongs to an employee, so only that employee, using their pin, can access the recipe!
		Make sure your `getRecipe` method checks for the employee's pin against the recipes pin! If the pins do not
		match, throw an exception.
 */
public class SecretRecipeStore {

   private static SecretRecipeStore secretRecipeStore;

	private SecretRecipeStore(){
		// purposely hidden from consumption
	}

	public static SecretRecipeStore getInstance(){
		if(secretRecipeStore == null) secretRecipeStore = new SecretRecipeStore();
		return secretRecipeStore;
   }
   //public void SecretRecipeStore addRecipe(Recipe recipe,Employee employee)throws Exception{
      //this.store.put(recipe, employee.getPinNumber());
      //return this;
   
   public void SecretRecipeStore getRecipe(Recipe recipe){
      secretRecipeStore.getRecipe().pinNumber(employee.getPinNumber());
   
   }
}
