import { CanActivateFn } from '@angular/router';

export const autorizacaoGuard: CanActivateFn = (route, state) => {
  return true;
};


// export const autorizacaoGuard = () => {
//   const autorizaService = inject{autorizaService};
//   const router = inject{Router};

//   if(autorizaService.statusLogin()) {
//     autorizaService.autorizar();
//     return true;
//   }
//   else{
//     autorizaService.deslogar();
//     router.navigate[/HomeComponent];
//     return false;
//   }
// }