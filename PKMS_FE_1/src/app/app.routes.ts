import { Routes } from '@angular/router';
import { LandingComponent } from './landing/landing.component';

export const routes: Routes = [
    { path: '', component: LandingComponent },
    { path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule) },
    { path: 'tasks', loadChildren: () => import('./tasks/tasks.module').then(m => m.TasksModule) },
    { path: 'notes', loadChildren: () => import('./notes/notes.module').then(m => m.NotesModule) }
  ];
