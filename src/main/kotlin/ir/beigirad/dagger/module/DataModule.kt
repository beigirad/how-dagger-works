package ir.beigirad.dagger.module

import dagger.Binds
import dagger.Module
import ir.beigirad.dagger.Repository
import ir.beigirad.dagger.RepositoryImpl

@Module
interface DataModule {
    @Binds
    fun bindRepository(impl: RepositoryImpl): Repository
}